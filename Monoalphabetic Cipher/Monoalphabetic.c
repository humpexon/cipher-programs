#include <stdio.h>
#include <string.h>
 
void main()
{
    char msg[100], ch;
    int I, key;
 
    print("Enter a message to encrypt: ");
    gets(msg);
    printf("Enter key: ");
    scanf("%d", &key);
 
    for(i = 0; msg[i] != '\0'; ++i){
        ch = msg[i];
 
        if(ch >= 'a' && ch <= 'z'){
            ch = ch + key;
 
            if(ch > 'z'){
                ch = ch - 'z' + 'a' - 1;
            }
 
            msg[i] = ch;
        }
        else if(ch >= 'A' && ch <= 'Z'){
            ch = ch + key;
 
            if(ch > 'Z'){
                ch = ch - 'Z' + 'A' - 1;
            }
 
            msg[i] = ch;
        }
    }
