import os

import aiviro
from aiviro import BaseScenario
from aiviro.modules.config import YAMLConfig

CONFIG_PATH = os.getenv("CONFIG_PATH", "data")
CONFIG_FILENAME = "main_config.yaml"


class Story01(BaseScenario):
    def __init__(self, config: YAMLConfig):
        super().__init__(config)
        self.r = self.robot("bender")

    def _before_run(self):
        self.r.wait_for(aiviro.Or(aiviro.Text("Recycle Bin"), aiviro.Text("Kos")), timeout=50)

    def _after_run(self):
        pass

    def _run(self):
        pass


def main():
    config = YAMLConfig(CONFIG_FILENAME, CONFIG_PATH)
    story = Story01(config)
    story.start()
    story.close()


if __name__ == "__main__":
    main()
