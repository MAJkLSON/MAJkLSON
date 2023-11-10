import aiviro
from aiviro.modules.pdf import create_pdf_robot

if __name__ == "__main__":
    aiviro.init_logging()
    r = create_pdf_robot().parse("invoice.pdf", skip_chars=["_"])

    invoice_date = r.get(aiviro.OnTheRight(
        aiviro.Text(),
        aiviro.Text("Invoice date")))

    descriptions = r.get(aiviro.Below(
        aiviro.Text(),
        aiviro.Text("Description")))

    descriptions = [item for item in descriptions if '-' not in item.text]

    total = r.get(aiviro.Below(
        aiviro.Number(),
        aiviro.Text("Total", element_index=1)))

    descriptions.append(invoice_date)
    descriptions.append(total)

    web_robot = aiviro.create_web_robot(headless=False, additional_args=["--incognito"])
    web_robot.go_to_url("https://todomvc.com/examples/react/#/")

    for item in descriptions:
        web_robot.type_text(item.text, skip_waiting=True)
        web_robot.key_press(aiviro.key.ENTER, skip_waiting=True)
