public class LabeledForLoop
{
public static void main (String[] args)
{
int i,j;
outer:
for(i=1;i<5;i++)
{
System.out.println();
inner:
for(j=1;j<5;j++)
{
System.out.println(j+"");
if(j==9)
break inner;
}
}
}
}