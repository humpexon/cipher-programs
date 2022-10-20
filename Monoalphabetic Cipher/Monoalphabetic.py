def monoalphabetic_cipher(text, key): 

output = "" 

for i in range(len(text)): 

char = text[i]I 

if char.isupper(): 

output += key[ord(char) - ord('A')].upper() 

else: 

output += key[ord(char) - ord('a')] 

return output
