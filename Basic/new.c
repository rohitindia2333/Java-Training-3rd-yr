#include<stdio.h>
#include<conio.h>
void main()
{
    char name[10],id[10];
    long basic,ta,da,hra,total;
    // clrscr();
    printf("Enter the employee name\n");
    gets(name);
    printf("enter the employee id\n");
    gets(id);
    printf("enter the employee basic salary\n");
    scanf("%ld",&basic);
    ta=(basic*25)/100;
    da=(basic*28)/100;
    hra=(basic*30)/100;
    total=basic+ta+da+hra;
    printf("*********************");
    printf("\nbasic=%ld",basic);
    printf("\nTA=%ld",ta);
    printf("\nda=%ld",da);
    printf("\nhra=%ld",hra);
    getch();
}