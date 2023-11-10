import aiviro.core.robots
from aiviro.core.utils.file_utils import load_image

if __name__ == "__main__":
    aiviro.init_logging()
    r = aiviro.create_static_robot()

    for helios_image in ["helios_01.png", "helios_02.png"]:
        img = load_image(helios_image)
        r.set_image(img)
        r.add_mask(aiviro.Area(0, 2170, 3600, 2256))
        with r.set_working_area(aiviro.BoundaryArea(
                aiviro.Text("HELIOS", element_index=2),     # should be done better
                aiviro.Button("Storno"),
                aiviro.boundary_type.DEFAULT)):
            pass
