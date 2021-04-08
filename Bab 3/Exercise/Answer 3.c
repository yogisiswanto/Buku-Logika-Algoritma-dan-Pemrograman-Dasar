#include <stdio.h>

int main() {
    
    // Variable declaration & inisialization
    char first = '1';
    char second = '2';
    char result;
    int temporary;
    
    // Casting each char and store to integer
    temporary = (int) first + (int) second;
    
    // Casting integer to char
    result = (char) temporary;
    
    // Print char
    printf("%c", result);
    
    
    return 0;
}