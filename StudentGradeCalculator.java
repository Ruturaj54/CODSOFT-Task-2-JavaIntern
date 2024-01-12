
import java.util.*;

class StudentGradeCalculator
{   
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize = 0;
        int j = 0;
        String Grade = "";

        System.out.println("Enter the Number of Subjects Here : ");
        iSize = sobj.nextInt();
        float Arr[] = new float[iSize];

        float fTotal = iSize * 100;
        float fSum = 0; 

        for(int i = 0;i < iSize;i++)
        {
            j++;
            System.out.println("Enter the Marks of "+j+" th Subject Here : ");
            Arr[i]= sobj.nextInt();
            fSum = fSum + Arr[i];
        }
        float Percentage = (fSum / fTotal) * 100;

        if(Percentage >= 90)
        {
            Grade = "First Class Distinction";
        }
        else if(Percentage >= 80)
        {
            Grade = "Distinction";
        }
        else if(Percentage >= 70)
        {
            Grade = "First Class";
        }
        else if(Percentage >= 60)
        {
            Grade = "Second Class";
        }
        else if(Percentage >= 50)
        {
            Grade = "Third Class";
        }
        else if(Percentage >= 35)
        {
            Grade = "Pass";
        }
        else
        {
            Grade = "Fail";
        }

        
        System.out.println("-------------------------------------------------------------");
        System.out.println("You Obtained Total Marks is : "+fSum+" Outoff "+fTotal+ "Marks");
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("You Obtained Percentage is : "+Percentage+" % Outoff 100 Marks");
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("You Have Achieved : "+Grade+" In the Exam");
        System.out.println("-------------------------------------------------------------");



        sobj.close();

    }
}