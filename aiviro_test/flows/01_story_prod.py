from prefect import task
from prefect.tasks.shell import ShellTask

from aiviro import AIVIRO_DEBUG_KEY
from aiviro.modules.prefect import create_aiviro_flow, run_aiviro_script


@task(name="aiviro-script")
def aiviro_script():
    run_aiviro_script(
        aiviro_config_path="/project/configuration/aiviro_config.yaml",
        script_path="src/01_story/main_01_story.py",
        env={AIVIRO_DEBUG_KEY: "0"},  # disable debug-mode
    )


if __name__ == "__main__":
    fl = create_aiviro_flow("RDP test", robot_env="rdp")

    shell_task = ShellTask(
        name="git-checkout-pull",
        command="git checkout main && git pull",
        helper_script="cd /project/git-repo",
        stream_output=True,
    )
    fl.add_task(shell_task)

    aiviro_script.set_upstream(shell_task, flow=fl)

    fl.register(project_name="Aiviro")