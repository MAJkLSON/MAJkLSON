## Úloha 04

Pri behu robota u zákaznika nastala nasledújúca chyba:

```python
Traceback (most recent call last):
 File "D:\customer\src\scenario_1\PPL\handler.py", line 69, in set_bookmark_collection_of_packets
   self.robot.click(aiviro.Button("Souhlasím"))
 File "D:\customer\venv\Lib\site-packages\aiviro\core\robots\robot_dynamic.py", line 57, in click
   self._cmd_proxy.click.execute(
 File "D:\customer\venv\Lib\site-packages\aiviro\core\utils\common.py", line 92, in inner
   x = foo(*args, **kwargs)
       ^^^^^^^^^^^^^^^^^^^^
 File "D:\customer\venv\Lib\site-packages\aiviro\core\commands\commands_device.py", line 57, in execute
   raise exceptions.SearchObjectError(f"Element '{element}' was not found")
aiviro.core.utils.exceptions.SearchObjectError: Element '<Button 'Souhlasím' FindMethod.SIMILAR/>' was not found
```

Na základe poskytnutej chyby a priložených log súborov, ktoré sa nachádzajú v priečinku `logs/`, identifikujte príčinu chyby.
Popíš dôvod, prečo k chybe došlo a navrhni riešenie, ktoré by túto chybu odstránilo.
Zameraj sa hlavne pri popise na postup, ktorým si sa k riešeniu dopracoval, aké informácie si použil a prečo.
