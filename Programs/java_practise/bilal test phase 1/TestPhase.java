import java.util.*;
class TestPhase{

	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		
		String courseName []  = {"cs101","cs201","cs301","cs401","cs406","it460","cs230"};
		
		int studentMarks [] =  new int[7];
		int obtainMarks =0;
		int marksPercent []  = new int [7];
		String subjectGrade [] = new String[7];
		int subjectGradePoint []  = new int [7];
		
		int totalCGpa  = 0;
		String remarks ="";
		for(int i=0; i<courseName.length; i++){
			
			System.out.print(i+") Enter "+courseName[i]+" : ");
			studentMarks[i] = ob.nextInt();
			
			obtainMarks = obtainMarks+studentMarks[i];
			
			int percent = (studentMarks[i]*100)/100;
			
			float allSubjectPercentage = (obtainMarks*100)/700f;
				
			if(percent<40){
				marksPercent[i] = percent;
				subjectGrade[i] = "F";
				subjectGradePoint[i] = 0;
				remarks ="Fail";
			}
			
			else if(percent>=40 && percent<50){
				
				marksPercent[i] = percent;
				subjectGrade[i] = "D";
				subjectGradePoint[i] = 1;
				remarks ="Pass";
			}
			
			else if(percent>=50 && percent<=64){
				
				marksPercent[i] = percent;
				subjectGrade[i] = "C";
				subjectGradePoint[i] = 2;
				remarks ="Satisfactory";
			}
			else if(percent>=65 && percent<=79){
				
				marksPercent[i] = percent;
				subjectGrade[i] = "B";
				subjectGradePoint[i] = 3;
				remarks ="Good";
			}
			
			
			else if(percent>=80 && percent<=100){
				
				marksPercent[i] = percent;
				subjectGrade[i] = "A";
				subjectGradePoint[i] = 4;
				remarks ="Excellent";
			}
			
			
		}//end of i for 
		
		
		
		for(int point=0; point<subjectGradePoint.length; point++){
			totalCGpa = totalCGpa+subjectGradePoint[point];
			
		}
		float cGpa  = totalCGpa/7f;
			
		System.out.println(" Subject \t  Marks % \t Grade \t  Grade Point ");
		for(int k=0; k<courseName.length; k++){
			
			
			System.out.println(k+" ) "+courseName[k]+" \t  "+marksPercent[k]+" % \t \t "+subjectGrade[k]+" \t \t "+subjectGradePoint[k]);
		}
		System.out.println(" \t \t  CGpA \t \t \t : "+cGpa);
		System.out.println(" \t \t  Remarks \t \t  : "+remarks);
	}//end f main

}