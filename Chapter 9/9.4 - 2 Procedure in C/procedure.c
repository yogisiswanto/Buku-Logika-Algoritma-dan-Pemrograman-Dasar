#include "pattern.h"

// Procedure for print square pattern
void square(int length){

    // Variable declaration
    int incrementRow, incrementColumn;

    // Loop for process row pattern
    for(incrementRow = 0; incrementRow < length; incrementRow++){

        // Loop for process column pattern
        for(incrementColumn = 0; incrementColumn < length; incrementColumn++){

            printf("*");
        }

        printf("\n");
    }
}

// Procedure for print triangle pattern
void triangle(int length){

    // Variable declaration
    int incrementRow, incrementColumn;

    // Loop for process row pattern
    for(incrementRow = 0; incrementRow <= length; incrementRow++){

        // Loop for process column pattern
        for(incrementColumn = 0; incrementColumn < incrementRow; incrementColumn++){

            printf("*");
        }

        printf("\n");
    }
}

// Procedure for print reverse triangle pattern
void reverseTriangle(int length){

    // Variable declaration
    int incrementRow, incrementColumn;

    // Loop for process row pattern
    for(incrementRow = 0; incrementRow <= length; incrementRow++){

        // Loop for process column pattern
        for(incrementColumn = length; incrementColumn > incrementRow; incrementColumn--){

            printf("*");
        }

        printf("\n");
    }
}