import aiviro
from aiviro.core.utils.file_utils import load_image

if __name__ == "__main__":
    aiviro.init_logging()
    img = load_image("login_screen.png")
    r = aiviro.create_static_robot()

    box = r.get(aiviro.Input("Email"), screen=img)
    print(f"Email: {box}")

    box = r.get(aiviro.Button("Log in"), screen=img)
    print(f"Log in: {box}")

    box = r.get(aiviro.Text("Frogot password?"), screen=img)
    print(f"Frogot password?: {box}")
