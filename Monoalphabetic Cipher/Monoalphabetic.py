def monoalphabetic_cipher(text, key): 

# initialize the ciphertext variable 

ciphertext = "" 

# traverse through each character in the given text 

for char in text: 

# if the character is in upper case 

if (char.isupper()): 

# find the corresponding ciphertext character 

ciphertext += key[ord(char) - ord('A')].upper() 

# if the character is in lower case 

else: 

# find the corresponding ciphertext character 

ciphertext += key[ord(char) - ord('a')].lower() 

# return the ciphertext 

return ciphertext
