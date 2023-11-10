import aiviro

if __name__ == '__main__':
    aiviro.init_logging()

    robot = aiviro.create_desktop_robot(display_id=2)

    robot.start_process("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", ["-incognito"])

    robot.type_text(
        "https://www.seznam.cz",
        skip_waiting=True
    )
    robot.key_press(aiviro.key.ENTER)

    robot.wait_for(
        aiviro.Text("Prave se hleda"),
        timeout=10
    )

    robot.key_shortcut(
        aiviro.key.LEFT_ALT.F4
    )

    robot.close()
