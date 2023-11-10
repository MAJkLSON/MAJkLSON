import aiviro

if __name__ == '__main__':
    aiviro.init_logging()

    robot = aiviro.create_web_robot(headless=False)

    robot.go_to_url("https://www.seznam.cz")

    robot.wait_for(
        aiviro.Text("Prave se hleda"),
        timeout=10
    )

    robot.close()
