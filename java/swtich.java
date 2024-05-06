import java.io.*;
class Jump3
{
static int sum(int x,int y)
{
int sum=0;
sum=x+y;
return sum;
}
public static void main(String[] args)
{ 
int s=sum(2,3);
System.out.println(s);
}
}
class switch
{
public static void main (String[]args) 
{
 int number=44;
String size;
switch(number)
{
case 29:
size ="Small";
break;
case 42:
size ="Medium";
break;
case 44:
size ="Large";
break;
case 48:
size ="extra large";
break;
default:
size ="Unkown";
break;
}
System.out.println("Size:"+size);
}
}