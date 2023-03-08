import java.util.*;
import java.lang.String;
class Schemes
{
   
    int z=0;
    public void Rythu_bharosa(int land,int income)
    {
        if(land<=5&&income<=250000)
        {
           System.out.println("YOU ARE ELIGIBLE FOR RYTHU BHAROSA SCHEME");
           z++;
        }
        else
        {
            System.out.println("UOU ARE NOT ELIGIBLE");
        }
    }
    public void Amma_vodi(int Class,int attendence)
    {
        if(Class<=12&&attendence>=75)
        {
            System.out.println("YOU ARE ELIGIBLE FOR AMMA VODI SCHEME");
            z++;
        }
        else
        {
            System.out.println("YOU ARE NOT ELIGIBLE FOR AMMA VODI SCHEME");
        }
    }
    public void Vidya_devena(int attendence,int income,int land)
    {
       
        if(attendence>=75&&income<=250000 && land<=10)
        {
            System.out.println("YOU ARE ELIGIBLE FOR VIDHYA DEVENA SCHEME");
            z++;
        }
        else 
        {
            System.out.println("YOU ARE NOT ELIGIBLE FOR VIDHYA DEVENA SCHEME");
        }
    }
    public void Ysr_pension(int age)
    {
      
        if(age>=60)
        {
            System.out.println("YOU ARE ELIGIBLE FOR YSR PENSION SCHEME");
            z++;
        }
        else
        {
            System.out.println("YOU ARE NOT ELIGIBLE FOR YSR PENSION SCHEME");
        }
    }
   public void Ysr_asara(int age)
   {
           if(age>=45&&age<=65)
            {
                System.out.println("YOU ARE ELIGIBLE FOR YSR ASARA SCHEME");
                z++;
            }
            else
            {
                System.out.println("YOU ARE NOT ELIGIBLE FOR YSR ASARA SCHEME");
            }
         }
   
   public void Arogyasree(int income,int age)
   {

            if(income<=500000&&age>=5)
            {
                System.out.println("YOU ARE ELIGIBLE FOR AROGYASREE SCHEME");
                z++;
            }
            else
            {
                System.out.println("YOU ARE NOT ELIGIBLE FOR AROGYASREE");
            }
    }
    public void Jala_yagnam(int dist_borewell,int land)
    {
        if(dist_borewell>=2000&&land>=1)
        {
            System.out.println("YOU ARE ELIGIBLE FOR JALA YAGNAM SCHEME");
            z++;
        }
        else
        {
            System.out.println("YOU ARE NOT ELIGIBLE FOR JALA YAGNAM SCHEME");
        }
    }
    public void Ban_on_alcohol(int percent)
    {
        if(percent>=50&&percent<=75)
        {
            System.out.println("IT IS LEGAL TO RUN ALCOHOL SHOPS IN AP");
            z++;
        }
        else
        {
            System.out.println("IT IS ILLEGAL TO RUN THE SHOP");
        }
    }
    public void Home(int land,int houses)
    {
        if(land==0&&houses==0)
        {
            System.out.println("YOU ARE ELIGIBLE FOR HOME SCHEME");
            z++;
        }
        else
        {
            System.out.println("YOU ARE NOT ELIGIBLE FOR HOME SCHEME");
        }
    }
   }
class Jagan_navaratnalu
{
    public static void main(String args[])
    {
        System.out.println("**************************JAGAN NAVARATNALU***************************");
        System.out.println("LET US KNOW,HOW MANY SCHEMES YOU ARE ELIGIBLE FOR JAGANANNA NAVARATNALU");
        Schemes s=new Schemes();
        Scanner in=new Scanner(System.in);
        System.out.println("enter the details for rythu bharosa");
        System.out.println("enter land and income");
        int land=in.nextInt();
        int income=in.nextInt();
        //String cat=in.nextLine();
        System.out.println("land= "+land);
        s.Rythu_bharosa(land,income);
        System.out.println("enter the details for amma vodi");
        System.out.println("enter class and attendence");
        int Class =in.nextInt();
        int attendence=in.nextInt();
        s.Amma_vodi(Class,attendence);
        System.out.println("enter the details for vidya devena");
        System.out.println("enter attendence ,income and land");
        int attend=in.nextInt();
        int incom=in.nextInt();
        int lan=in.nextInt();
        s.Vidya_devena(attend,incom,lan);
        System.out.println("enter the details for ysr pension");
        System.out.println("enter age");
        int age=in.nextInt();
        s.Ysr_pension(age);
        System.out.println("enter the details for arogyasree");
        System.out.println("enter income and age");
        int inc=in.nextInt();
        int years=in.nextInt();
        s.Arogyasree(inc,years);
        System.out.println("enter the details for ysr asara");
        System.out.println("enter age");
        int old=in.nextInt();
        s.Ysr_pension(age);
        System.out.println("enter the details for jala yagnam scheme");
        System.out.println("enter distance between borewell and how much land u have");
        int b=in.nextInt();
        int la=in.nextInt();
        s.Jala_yagnam(b, land);
        System.out.println("enter the details for ban on alcohol");
        System.out.println("enter the cost percentage per litre");
        int percent=in.nextInt();
        s.Ban_on_alcohol(percent);
        System.out.println("enter the details for home scheme");
        System.out.println("enter land and houses");
        int l=in.nextInt();
        int h=in.nextInt();
        s.Home(land, h);
        System.out.println("*************CONGRATULATION***********");
        System.out.println("YOU ARE BENEFITED FROM  "+s.z+" SCHEMES");
        System.out.println("**************************************");
    }
}