package miniproject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class student_management{
int password;
String username;
String branch;

Scanner in= new Scanner(System.in);

 void practice(){
	System.out.println("Enter Username: ");
	username=in.next();
	System.out.println("Enter Password: ");
	password=in.nextInt();
}
 

  }
class Branch  extends student_management{
int year;

 void Year_select()
{
			System.out.println("1st Year ");
			System.out.println("2nd Year ");
			System.out.println("3rd Year ");
			System.out.println("4th Year ");
			System.out.println("Select year: ");
		   int year=in.nextInt();
		   while(year>4) {
			   System.out.println("Please Enter the year between 1 to 4 !");
			year=in.nextInt();
		   }
	 if(year == 1)
	{
		System.out.println("SEM 1");
		System.out.println("SEM 2");
	}
	else if(year == 2)
	{
		System.out.println("SEM 3");
		System.out.println("SEM 4");
	}
	else if(year == 3)
	{
		System.out.println("SEM 5");
		System.out.println("SEM 6");
	}
	else
	{
		System.out.println("SEM 7");
		System.out.println("SEM 8");
	}
  }
}

class FE extends Branch{
	int Sem;
	int course_code;
	
	void disp1() {
		
		System.out.println(" Welcome !, here is our Course Categories:  ");
		System.out.println(" EXTC ");
		System.out.println(" COMPS ");
		System.out.println(" IT ");
		System.out.println(" Mechanical ");
		System.out.println(" Select your branch:  ");
		branch=in.next();
	
		if (branch!="EXTC" && branch!="Mechanical" && branch!="IT" && branch!="COMPS" ) {
			System.out.println("Please enter from the given 4 options!");
			branch=in.next();
		}
		
	}
		
	
	
	
	
	 void FE1()
	 {
		
		 System.out.println("Select the Semester :");
		 Sem=in.nextInt();
		 while(Sem>8) {
			 System.out.println("Please select the semester from 1 to 8!");
			 Sem=in.nextInt();
		 }
		 //System.out.println("HI");
		 
		 switch (branch) {
			case "EXTC": 
				if(Sem == 1 ) {
				 System.out.println("FEC 101 : Engineering Mathematics-1");
				 System.out.println("FEC 102 : Engineering Physics-1");
				 System.out.println("FEC 103 : Engineering Chemistry-1");
				 System.out.println("FEC 104 : Engineering Mechanics");
				 System.out.println("FEC 105 : Basic Electrical Engineering ");
				 System.out.println("Select the course of your choice (Just enter the subject code for e.g. for selecting maths enter 101):");
				 course_code=in.nextInt();
			 }
			else if (Sem == 2)
			 {
				 System.out.println("FEC 201 : Engineering Mathematics-2");
				 System.out.println("FEC 202 : Engineering Physics-2");
				 System.out.println("FEC 203 : Engineering Chemistry-2");
				 System.out.println("FEC 204 : Engineering Drawing");
				 System.out.println("FEC 205 : C programming");
				 System.out.println("FEC 206 : Professional Communication and Ethics-1");
				 System.out.println("Select the course of your choice (Just enter the subject code for e.g. for selecting maths enter 201):");
				 course_code=in.nextInt();
			 }
			 
			 else if(Sem ==3)
			 {
				 System.out.println("Sem 3");
					System.out.println("                 Applied Maths - III");
					System.out.println("-->>> Discussion Forum");
					System.out.println("Module 1:  Laplace Transform");
					System.out.println("[]Quiz on Laplace Transform");
					System.out.println("Lecture notes and Problems.PDF");
					System.out.println("Module 3: Fourier Series");
					System.out.println("Practice problems.PDF");
					System.out.println("Fourier series chart.PDF");
					System.out.println("[]Quiz 1 on Fourier series");
					System.out.println("[]Module Quiz FS");
					System.out.println("Module 4: Complex Functions");
				    System.out.println("[]Quiz on Complex Functions ");
					System.out.println("                  Skill Lab: C++ and Java Programming");
					System.out.println("[]Crossword puzzle.link");
					System.out.println("List of proposed Experiments 21-22.docx");
					System.out.println("[]Lab1,2,3 Submission link");
					System.out.println("                  Digital System Design");
					System.out.println("Module 1. Number Systems and Codes");
					System.out.println("[]Lecture 1. Introduction to DSD.pdf");
					System.out.println("[]Module 1 ppt AY 20-21.pdf");
					System.out.println("                  EICS");
					System.out.println("Module 3: Introduction to Control System Analysis ");
					System.out.println("Module 4: Response of Control Systems");
					System.out.println("Module 5: Stability Analysis in Time Domain");
		           
			 }
			 else if(Sem ==4)
			 {

					System.out.println("\n\n\nSem 4");
					System.out.println("                 Applied Maths - IV");
					System.out.println("");
					System.out.println("                 Skill Lab on Python Programming");
					System.out.println("                 Control Systems");
					
			 }
			 
			 else if(Sem ==5)
			 {
				System.out.println("Digital VLSI");
			    System.out.println("Random Signal Analysis");
			    System.out.println("Digital Communication");
			    System.out.println("Electromagnetic Engineering");
			    System.out.println("Discrete Time Signal Processing ");
			    
			 }
			 else if(Sem ==6)
			 {
				 System.out.println("Database Management System");
				 System.out.println("Audio Processing");
				 System.out.println("Radar Engineering");
				 System.out.println("Image processing and Machine vision");
				 System.out.println("Microcontroller and Applications");
				 
			 }
			 else if(Sem ==7)
			 {
				 System.out.println("ECC701 - Microwave Engineering ");
				 System.out.println("ECC702 - Mobile Communication ");
				 System.out.println("ECC703 - Optical Communication ");
				 System.out.println("ECCDLO7032 - Big Data Analytics  ");
				 System.out.println("ECCDLO7033 - Internet Communication Engineering ");
				 System.out.println("ECCDLO7034 - CMOS Mixed Signal VLSI ");
				 System.out.println("ECCDLO7035 - Embedded Systems ");
				 
			 }
			 else 
			 {
				 System.out.println("ETC801 - Wireless Networks 2020 ");
				 System.out.println("ETP801 - Project Stage -2  ");
				 System.out.println("RF Design (2020-21) ");
				 System.out.println("ECCDLO8043 - Satellite Communication ");
				 System.out.println("ETL801 - Wireless Network Laboratory ");
				 
			 }
			 if (course_code== 101)
			 {
				 System.out.println("Engineering MAthematics - 1");
				 System.out.println("Syllabus \n");
				 System.out.println("Teaching and Learning plan \n ");
				 System.out.println("Pre-requisite test \n");
				 System.out.println("Course Objectives and Outcomes \n");
				 System.out.println("Module 1: Complex Numbers \n   Notes \n   Quiz on Module 1 \n   Tutorial  1 Submission Link \n");
				 System.out.println("Module 2: Hyperbolic Functions and Logarithm of Complex Numbers \n   Notes \n   Quiz on Module 2 \n    Tutorial 2 Submission Link \n");
				 System.out.println("Module 3: Partial Differentiation \n   Notes \n   Quiz on Module 3 \n   Tutorial 3 Submission Link \n");
				 System.out.println("Module 4: Applications of Partial Differentiation and Successive Differentiation \n   Notes \n   Quiz on Module 4 \n   Tutorial 4 Submission Link \n");
				 System.out.println("Module 5: Matrices \n   Notes \n   Quiz on Module 5 \n   Tutorial 5 Submission Link");
			 }
			 else if(course_code == 102)
			 {
				 System.out.println("Engineering Physics - 1 \n");
				 System.out.println("Syllabus \n");
				 System.out.println("Teaching and Learning plan \n ");
				 System.out.println("Pre-requisite test \n");
				 System.out.println("Course Objectives and Outcomes \n");
				 System.out.println("Module 1 - Quantum Physics \n");
				 System.out.println("Module 2 - Crystallography \n" );
				 System.out.println("Module 3 - Semiconductor Physics \n ");
				 System.out.println("Module 4 - Interference in thin film  \n");
				 System.out.println("Module 5 - Superconductors and Supercapacitors  \n");
				 System.out.println("Module 6 - Engineering Material and Applications  \n");
				 
			 }
			 else if(course_code == 103)
			 {
				 System.out.println("Engineering Chemistry - 1 \n");
				 System.out.println("Syllabus  \n");
				 System.out.println("Teaching and Learning plan  \n");
				 System.out.println("Pre-requisite test  \n");
				 System.out.println("Course Objectives and Outcomes  \n");
				 System.out.println("Module 1: Atomic and Molecular Structure \n   Notes \n   Quiz on Module 1 \n");
				 System.out.println("Module 2: Aromatic systems and their Molecular Structure \n   Notes \n   Quiz on Module 2 \n ");
				 System.out.println("Module 3: Intermolecular Forces and Critical Phenomenon \n   Notes \n   Quiz on Module 3 \n" );
				 System.out.println("Module 4: Phase rule - Gibbs' Phase Rule \n   Notes \n   Quiz on Module 4 \n ");
				 System.out.println("Module 5: Polymers \n   Notes \n   Quiz on Module 5 \n");
				 System.out.println("Module 6: Water \n   Notes \n   Quiz on Module 6");
			 }
			 else if(course_code == 104)
			 {
				 System.out.println("Engineering Mechanics \n");
				 System.out.println("Syllabus  \n");
				 System.out.println("Teaching and Learning plan  \n" );
				 System.out.println("Pre-requisite test  \n");
				 System.out.println("Course Objectives and Outcomes  \n");
				 System.out.println("Module 1 - Coplanar, Non-Coplanar Force System, Resultant and Centroid \n");
				 System.out.println("Module 2 - Equilibrium of Systems \n");
				 System.out.println("Module 3 - Friction \n ");
				 System.out.println("Module 4 - Kinematics Of Particles \n");
				 System.out.println("Module 5 - Kinematics of Rigid Bodies \n ");
				 System.out.println("Module 6 - Kinetics of Particles ");
			 }
			 else if(course_code == 105)
			 {
				 System.out.println("Basic Electrical Engineering \n");
				 System.out.println("Syllabus  \n");
				 System.out.println("Teaching and Learning plan  \n");
				 System.out.println("Pre-requisite test  \n");
				 System.out.println("Course Objectives and Outcomes  \n");
				 System.out.println("Lab Submission Links ");
				 System.out.println("Module 1 - DC Circuits \n   Notes \n   Quiz on Module 1 \n");
				 System.out.println("Module 2 - AC Circuits \n   Notes \n   Quiz on Module 2 \n");
				 System.out.println("Module 3 - Generation of 3 phase AC Circuits \n   Notes \n   Quiz on Module 3 \n");
				 System.out.println("Module 4 - Transformers \n   Notes \n   Quiz on Module 4 \n");
				 System.out.println("Module 5 - Electrical Machines \n   Notes \n   Quiz on Module 5 \n");
				 System.out.println("Module 6 - Single Phase Induction Motor and Stepper Motor \n   Notes \n   Quiz on Module 6 \n");
			 }
			 else if(course_code == 201)
			 {
				 System.out.println("Engineering Mathematics - 2 \n");
				 System.out.println("Syllabus  \n");
				 System.out.println("Teaching and Learning plan  \n");
				 System.out.println("Pre-requisite test  \n");
				 System.out.println("Course Objectives and Outcomes  \n");
				 System.out.println("Module 1 : Differential Equation of First Order First Degree \n   Notes \n   Quiz on Module 1 \n");
				 System.out.println("Module 2 : Higher Order Differential Equations  \n");
				 System.out.println("Module 3 : Beta, Gamma Integrals , DUIS and Rectification  \n");
				 System.out.println("Module 4 : Double Integration  \n");
				 System.out.println("Module 5 : Multiple Integration 2  \n");
			 }
			 else if(course_code == 202)
			 {
				 System.out.println("Engineering Physics - 2 \n");
				 System.out.println("Syllabus \n");
				 System.out.println("Teaching and Learning plan  \n");
				 System.out.println("Pre-requisite test  \n");
				 System.out.println("Course Objectives and Outcomes  \n");
				 System.out.println("Module 1 : DIFFRACTION \n");
				 System.out.println("Module 2 : LASER AND FIBRE OPTICS \n");
				 System.out.println("Module 3 : ELECTRODYNAMICS \n");
				 System.out.println("Module 4 : RELATIVITY \n");
				 System.out.println("Module 5 : NANOTECHNOLOGY \n");
				 System.out.println("Module 6 : PHYSICS OF SENSORS \n");
			 }
			 else if(course_code == 203)
			 {
				 System.out.println("Engineering Chemistry - 2 \n");
				 System.out.println("Syllabus  \n" );
				 System.out.println("Teaching and Learning plan  \n");
				 System.out.println("Pre-requisite test  \n");
				 System.out.println("Course Objectives and Outcomes  \n");
				 System.out.println("Module 1 : Principles of Spectroscopy \n");
				 System.out.println("Module 2 : Applications of Spectroscopy \n");
				 System.out.println("Module 3 : Concepts of Electrochemistry \n");
				 System.out.println("Module 4 : Corrosion \n");
				 System.out.println("Module 5 : Green Chemistry and Synthesis of Drugs \n");
				 System.out.println("Module 6 : Fuels \n");
				 
			 }
			 else if(course_code == 204)
			 {
				 System.out.println("Engineering Drawing \n");
				 System.out.println("Syllabus  \n");
				 System.out.println("Teaching and Learning plan \n");
				 System.out.println("Pre-requisite test  \n");
				 System.out.println("Course Objectives and Outcomes  \n");
				 System.out.println("Module 1 : Orthographic Projection \n");
				 System.out.println("Module 2 : Sectional Orthographic Projection \n");
				 System.out.println("Module 3 : Isometric Projection \n");
				 System.out.println("Module 4 : Projection of Line & Plane \n");
				 System.out.println("Module 5 : Projection of solids \n");
				 
			 }
			 else if(course_code == 205)
			 {
				 System.out.println("C Programming \n");
				 System.out.println("Syllabus  \n");
				 System.out.println("Teaching and Learning plan  \n");
				 System.out.println("Pre-requisite test  \n");
				 System.out.println("Course Objectives and Outcomes \n");
				 System.out.println("Module 1 : Introduction and Fundamentals of C Programming  \n Lecture Notes   \n  Programs \n");
				 System.out.println("Module 2 : Branching and looping structures \n Lecture Notes   \n  Programs \n");
				 System.out.println("Module 3 : Functions \n Lecture Notes   \n  Programs  \n");
				 System.out.println("Module 4 : Arrays and Strings \n Lecture Notes   \n  Programs \n");
				 System.out.println("Module 5 : Structure and Union \n Lecture Notes   \n  Programs  \n");
				 System.out.println("Module 6 : Pointers \n Lecture Notes   \n  Programs \n");
			 }
			 else if(course_code == 206)
			 {
				 System.out.println("Professional Communication and Ethics - 1 \n");
				 System.out.println("Syllabus  \n");
				 System.out.println("Teaching and Learning plan  \n");
				 System.out.println("Pre-requisite test  \n");
				 System.out.println("Course Objectives and Outcomes  \n");
				 System.out.println("Module 01 : Fundamentals of Communication \n   Notes \n");
				 System.out.println("Module 02 : Verbal Aptitude for Employment \n   Notes \n");
				 System.out.println("Module 03 : Developing Reading and writing Skills \n   Notes \n");
				 System.out.println("Module 04 : Business Correspondence \n   Notes \n");
				 System.out.println("Module 05 : Basic Technical Writing \n   Notes \n");
				
			 }
			 break;

			 
			 
				               
				                 case "Mechanical": 
				                 if(Sem == 1 ) {
				           		 System.out.println("FEC 101 : Engineering Mathematics-1");
				        		 System.out.println("FEC 102 : Engineering Physics-1");
				        		 System.out.println("FEC 103 : Engineering Chemistry-1");
				        		 System.out.println("FEC 104 : Engineering Mechanics");
				        		 System.out.println("FEC 105 : Basic Electrical Engineering ");
				        		 System.out.println("Select the course of your choice (Just enter the subject code for e.g. for selecting maths enter 101):");
				        		 course_code=in.nextInt();
				        	 }
				        	else if (Sem == 2)
				        	 {
				        		 System.out.println("FEC 201 : Engineering Mathematics-2");
				        		 System.out.println("FEC 202 : Engineering Physics-2");
				        		 System.out.println("FEC 203 : Engineering Chemistry-2");
				        		 System.out.println("FEC 204 : Engineering Drawing");
				        		 System.out.println("FEC 205 : C programming");
				        		 System.out.println("FEC 206 : Professional Communication and Ethics-1");
				        		 System.out.println("Select the course of your choice (Just enter the subject code for e.g. for selecting maths enter 201):");
				        		 course_code=in.nextInt();
				        	 }
				        	else if(Sem==3) {
				        		System.out.println("MEC301 : Mathematics-III");
				        		System.out.println("MEC302 : Strength of Materials");
				        		System.out.println("MEC303 : Production Processes");
				        		System.out.println("MEC304 : Materials Metallurgy");
				        		System.out.println("MEC305 : Thermodynamics");
				        	}
				        	else if (Sem==4) {
				        		System.out.println("MEC401 : Mathematics-IV");
				        		System.out.println("MEC402 : Fluid Mechanics");
				        		System.out.println("MEC403 : Kinematics of Machinery");
				        		System.out.println("MEC404 : CAD/CAM");
				        		System.out.println("MEC405 : Inustrial Electronics");
				        	}
		                    else if (Sem==5) {
		                    	System.out.println("MEC501 : Mechanical measurements and Controls");
				        		System.out.println("MEC502 : Thermal Engineering");
				        		System.out.println("MEC503 : Dynamics of Machinery");
				        		System.out.println("MEDLO501X : Department Level Optional Course I");
				        		
				        	}
		                    else if (Sem==6) {
		                    	System.out.println("MEC601 : Machine Design");
				        		System.out.println("MEC602 : Turbo Machinery");
				        		System.out.println("MEC603 : Heating , Ventiolation , Air conditioning and Refrigeration");
				        		System.out.println("MEC604 : Automation and Artificial Intelligence");
				        		System.out.println("MEDLO602X: Department Level Optional Course II");
				        	}
		                    else if (Sem==7) {
		                    	System.out.println("MEC701 : Machine Design II");
				        		System.out.println("MEC702 : CAD/CAM/CAE");
				        		System.out.println("MEC703 : Production Planning and Control");
				        		System.out.println("MEDLO704X : Department Level Optional Course III");
				        		System.out.println("ILO701X :Institute Level Optional Course I");
				        		System.out.println("MEL704: Project I");
			 
		                    }
		                    else {
		                    	System.out.println("MEC801 : Design of Mehanical Systems");
				        		System.out.println("MEC802 : Industrial Engineering and Management");
				        		System.out.println("MEDLO804X : Department Level Optional Course IV");
				        		System.out.println("ILO802X : Institute Level Optional Course II");
				        		System.out.println("MEP801 : Project II");
			
		                    }
						      break;
						              
						      
						      
						      
				                 case "IT" : if(Sem==1) {
					                	System.out.println("FEC 101 : Engineering Mathematics-1");
						        		 System.out.println("FEC 102 : Engineering Physics-1");
						        		 System.out.println("FEC 103 : Engineering Chemistry-1");
						        		 System.out.println("FEC 104 : Engineering Mechanics");
						        		 System.out.println("FEC 105 : Basic Electrical Engineering ");
						        		 System.out.println("Select the course of your choice (Just enter the subject code for e.g. for selecting maths enter 101):");
						        		 course_code=in.nextInt();
						        	 }
						        	else if (Sem == 2)
						        	 {
						        		 System.out.println("FEC 201 : Engineering Mathematics-2");
						        		 System.out.println("FEC 202 : Engineering Physics-2");
						        		 System.out.println("FEC 203 : Engineering Chemistry-2");
						        		 System.out.println("FEC 204 : Engineering Drawing");
						        		 System.out.println("FEC 205 : C programming");
						        		 System.out.println("FEC 206 : Professional Communication and Ethics-1");
						        		 System.out.println("Select the course of your choice (Just enter the subject code for e.g. for selecting maths enter 201):");
						        		 course_code=in.nextInt();
						        	 }
						        	else if (Sem==3) {
						        		System.out.println("ITC301 Engineering Mathematics- 3");
						        		System.out.println("ITC302 Data Structure and Analysis");
						        		System.out.println("ITC303 Database Management System");
						        		System.out.println("ITC304 Principle of Communication");
						        		System.out.println("ITC305 Pardigms and Computer Programming Fundamentals");
						        	}
						        	else if(Sem==4) {
						        		System.out.println("ITC401 Engineering Mathematics-4");
						        		System.out.println("ITC402 Computer Network and Network Design");
						        		System.out.println("ITC403 Operating System");
						        		System.out.println("ITC404 Automata Theory");
						        		System.out.println("ITC405 Computer Organization and Architecture");
						        	}
						        	else if(Sem==5) {
						        		System.out.println("ITC501 Microcontrollers and Embedded Programming");
						        		System.out.println("ITC502 Internet Programming");
						        		System.out.println("ITC503 Advanced Data Management Technology");
						        		System.out.println("ITC504 Cryptography and Network Security");
						        		System.out.println("ITDLO-1 Department Level Optional Course -1");
						        	}
						        	else if(Sem==6) {
						        		System.out.println("ITC601 Software Engineering with Project Management");
						        		System.out.println("ITC602 Data Mining and Business Intelligence");
						        		System.out.println("ITC603 Cloud Computing and Services");
						        		System.out.println("ITC604 Wireless Networks");
						        		System.out.println("ITDLO-2 Department Level Optional Course-2");
						        	}
						        	else if(Sem==7) {
						        		System.out.println("ITC701 Enterprise Network Design");
						        		System.out.println("ITC702 Infrastructure Security");
						        		System.out.println("ITC703 Artificial Intelligence");
						        		System.out.println("ITDLO-2 Department Level Optional Course-3");
						        		System.out.println("ITLO-1 Institute Level Optional Course-1");
						        	}
						        	else {
						        		System.out.println("ITC801 Big Data Analytics");
						        		System.out.println("ITC802 Internet of Everything");
						        		System.out.println("ITDLO-4 Department Level Optional Course-4");
						        		System.out.println("ILO-2 Institute Level Optional Course-2");
						        		
						        	}
				                 
				                 
				                 
				                 case "COMPS": if(Sem == 1 ) {
					           		 System.out.println("FEC 101 : Engineering Mathematics-1");
					           		 System.out.println("FEC 102 : Engineering Physics-1");
					           		 System.out.println("FEC 103 : Engineering Chemistry-1");
					           		 System.out.println("FEC 104 : Engineering Mechanics");
					           		 System.out.println("FEC 105 : Basic Electrical Engineering ");
					           		 System.out.println("Select the course of your choice (Just enter the subject code for e.g. for selecting maths enter 101):");
					           		course_code=in.nextInt();
					           	 }
					           	else if (Sem == 2)
					           	 {
					           		 System.out.println("FEC 201 : Engineering Mathematics-2");
					           		 System.out.println("FEC 202 : Engineering Physics-2");
					           		 System.out.println("FEC 203 : Engineering Chemistry-2");
					           		 System.out.println("FEC 204 : Engineering Drawing");
					           		 System.out.println("FEC 205 : C programming");
					           		 System.out.println("FEC 206 : Professional Communication and Ethics-1");
					           		 System.out.println("Select the course of your choice (Just enter the subject code for e.g. for selecting maths enter 201):");
					           		course_code=in.nextInt();
					           	 }
					           	 
					           	 else if(Sem ==3)
					           	 {
					           		    System.out.println("CSC301 : Engineering MathematicsIII ");
					           			System.out.println("CSC302 : Discrete Structures and Graph Theory");
					           			System.out.println("CSC303 : Data Structure");
					           			System.out.println("CSC304 : Digital Logic & Computer Architecture");
					           			System.out.println("CSC305 : Computer Graphics");
					           			
					           			
					                      
					           	 }
					           	 else if(Sem ==4)
					           	 {

					           			System.out.println("CSC401 : Engineering Mathematics IV");
					           			System.out.println("CSC402 : Analysis of Algorithm");
					           			System.out.println("CSC403 : Database Management System");
					           			System.out.println("CSC404 : Operating System");
					           			System.out.println("CSC405 : Microprocessor");
					           			
					           	 }
					           	 
					           	 else if(Sem ==5)
					           	 {
					           		System.out.println("CSC501 : Microprocessor ");
					           	    System.out.println("CSC502 : Data Base Management");
					           	    System.out.println("CSC503 : Computer Network");
					           	    System.out.println("CSC504 : Theory of Computer Science");
					           	    System.out.println("CSCDLO501X : Department Level Option Course-1");
					           	    
					           	 }
					           	 else if(Sem ==6)
					           	 {
					           		 System.out.println("CSC601 : Software Engineering");
					           		 System.out.println("CSC602 : System Programming & Compiler Construction");
					           		 System.out.println("CSC603 : Data Warehousing & Mining");
					           		 System.out.println("CSC604 : Cryptography & System Security");
					           		 System.out.println("CSCDLO601X : Department Level Option Course-2");
					           		 
					           	 }
					           	 else if(Sem ==7)
					           	 {
					           		 System.out.println("CSC701 - Digital Signal & Image Processing ");
					           		 System.out.println("CSC702 - Mobile Communication & Computing ");
					           		 System.out.println("CSC703 - Artificial Intelligence & Soft Computing ");
					           		 System.out.println("CSDLO701X - Department Level Option Course-3  ");
					           		 System.out.println("ILO701X - Institute Level Option Course-1");
					           		 
					           	 }
					           	 else 
					           	 {
					           		 System.out.println("CSC801 : Human Machine Interaction");
					           		 System.out.println("CSC802 : Distributed Computing ");
					                 System.out.println("CSDLO801X - Department Level Option Course-4  ");
					           		 System.out.println("ILO701X - Institute Level Option Course-2 ");		           		
					           	 }         
				                 default: System.out.println("");
			}
		 
		 
	 }
}

@SuppressWarnings("serial")
public class practice extends JFrame implements ActionListener{
	String Username , Branch;
	int Password;
	JTextField TF_1;
	JTextField TF_2;
	JButton B_1;
	Scanner in= new Scanner(System.in);
	
	void function(){
		setSize(200,200);
		setTitle("Don Bosco Institute Of Technology,Kurla");
		JLabel O=new JLabel("Username:");
		add(O);
		TF_1=new JTextField(10);
		add(TF_1);
		JLabel L1=new JLabel("Password:");
		add(L1);
		TF_2=new JTextField(10);
		add(TF_2);
		B_1=new JButton("Login");
		B_1.addActionListener(this);
		add(B_1);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj_1=e.getSource();
		if(obj_1==(B_1)) {
			Username= TF_1.getText();
			JOptionPane.showMessageDialog(this,"Hello "+Username+ "!");  //dialogue box
		}
	}
	public static void main(String[] args) {
		practice p1=new practice();
		FE e=new FE();
		Branch b=new Branch();
		p1.function();
		e.disp1();
		b.Year_select();
		e.FE1();
		@SuppressWarnings("unused")
		student_management p=new student_management();
		//p.practice();
		
	}
}
