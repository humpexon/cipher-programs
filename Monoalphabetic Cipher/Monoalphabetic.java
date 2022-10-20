public class MonoalphabeticCipher {

private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

private static final String CODE = "zyxwvutsrqponmlkjihgfedcba";

public static String encode(String plaintext) {

StringBuilder ciphertext = new StringBuilder();

for (int i = 0; i < plaintext.length(); i++) {

char ch = plaintext.charAt(i);

int index = ALPHABET.indexOf(ch);

char code = CODE.charAt(index);

ciphertext.append(code);

}

return ciphertext.toString();

}

public static String decode(String ciphertext) {

StringBuilder plaintext = new StringBuilder();

for (int i = 0; i < ciphertext.length(); i++) {

char code = ciphertext.charAt(i);

int index = CODE.indexOf(code);

char ch = ALPHABET.charAt(index);

plaintext
