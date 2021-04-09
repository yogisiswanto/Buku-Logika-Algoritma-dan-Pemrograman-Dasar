#include <stdio.h>
#include <math.h>

typedef struct
{
	int x;
	int y;
	int r;
}segitiga;

int main()
{
	segitiga triangle;

	scanf("%d", &triangle.x);
	scanf("%d", &triangle.y);

	triangle.r = sqrt((triangle.x * triangle.x) + (triangle.y * triangle.y));

	printf("%d\n", triangle.r);

	return 0;
}