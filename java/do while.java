import java.io.*;
class Loop6
{
public static void main (String args[])
{
int row=1,column=1;
int x;
do
{
x=4;
do {
System.out.println("");
x--;
}
while(x>=row);
column=1;
do {
System.out.println(column+"");
column++;
} while (column<=5);
System.out.println("");
row++;
}while(row<=5);
}
}