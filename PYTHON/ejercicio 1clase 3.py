Python 3.14.3 (tags/v3.14.3:323c59a, Feb  3 2026, 16:04:56) [MSC v.1944 64 bit (AMD64)] on win32
Enter "help" below or click "Help" above for more information.
>>> #Moatrar "Del 1 al 10, como estuvo tu dia?"
... from string import punctuation
... 
... print("Del 1 al 10, como estuvo tu dia?")
... dia = int(input("poner puntuacion"))
... if dia >= 8:
...     print("tu dia estuvo exelente")
... elif dia >= 5:
...     print("tu dia estuvo normal")
... else:
