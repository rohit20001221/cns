#include<stdio.h>

int main() {
    char message[11] = "Hello World";

    for(int i=0; i < 11; i++){
        message[i] = message[i] ^ 127;

        message[i] = message[i] & 127;
    }

    printf("Output: %s", message);
}