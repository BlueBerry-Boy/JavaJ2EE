start /b /wait powershell.exe -nologo -WindowStyle Hidden -sta -command "IF ([console])::Capslock -eq 'True'){$wsh = New-object -Comobject wscript.shell;$wsh.Sendkeys('{CAPSLOCK}')}"
Taskkill /F /IM iexplore.exe
Taskkill /F /IM chrome.exe
Taskkill /F /IM firefox.exe