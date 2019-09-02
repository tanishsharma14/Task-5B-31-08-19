import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	
	public static void display(ArrayList<Employee> emp)
	{
		for(Employee e:emp)
			{
				System.out.println(e.toString());
			}
	}
	public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
		ArrayList<Employee> alist=new ArrayList<>();
		
		System.out.println("Please choose one of the option");
		int input;
		do
		{
			System.out.println("1. Add employee");
			System.out.println("2. View all employees");
			System.out.println("3. Remove employee");
			System.out.println("4. Clear data");
			System.out.println("5. Change salary");
			System.out.println("6. Search employee");
			System.out.println("7. View department wise list");
			System.out.println("8. Sort the data");
			System.out.println("9. Exit");
			
			input=sc.nextInt();
			
			switch(input)
			{
			case 1:
				{
					int empno;
					String ename;
					int salary;
					String desg;
					String dept;
					
					System.out.println("Enter employee no");
					empno=sc.nextInt();
					System.out.println("Enter employee name");
					ename=sc.next();
					System.out.println("Enter salary");
					salary=sc.nextInt();
					System.out.println("Enter designation");
					desg=sc.next();
					System.out.println("Enter department");
					dept=sc.next();
					
					Employee e=new Employee(empno,ename,salary,desg,dept);
					alist.add(e);
					System.out.println("Employee added successfully");
					System.out.println();
					break;
				}
				
			case 2:
			{
				System.out.println("All the employees details");
				for(Employee s:alist)
				{
					System.out.println(s.toString());
				}
				System.out.println();
				break;
			}
			
			case 3:
				{
					System.out.println("Enter employee no");
					int eno=sc.nextInt();
					boolean flag=false;
					for(int i=0;i<alist.size();i++)
					{
						if(alist.get(i).getEmpno()==eno)
						{
							alist.remove(i);
							flag=true;
						}
					}
					
					if(flag==true)
						System.out.println("Employee record removed successfully");
					else
						System.out.println("Emplouee not found");
					
					System.out.println();
					break;
				}
				
			case 4:
			{
				alist.clear();
				System.out.println("All data cleared");
				System.out.println();
				break;
			}
			
			case 5:
			{
				System.out.println("Enter employee no");
				int eno=sc.nextInt();
				System.out.println("Enter new salary");
				int sal=sc.nextInt();
				boolean flag=false;
				for(int i=0;i<alist.size();i++)
					{
						if(alist.get(i).getEmpno()==eno)
						{
							alist.get(i).setSalary(sal);
							System.out.println("Salary updated successfully");
							flag=true;
						}
					}
				
				if(flag==false)
					System.out.println("Employee bot found");
				
				System.out.println();
				break;
			}
			
			case 6:
				{
					System.out.println("Enter employee number");
					int eno=sc.nextInt();
					boolean flag=false;
					for(int i=0;i<alist.size();i++)
					{
						if(alist.get(i).getEmpno()==eno)
						{
							System.out.println(alist.get(i).toString());
							flag=true;
						}
					}
					
					if(flag==false)
						System.out.println("Employee not found");
					
					System.out.println();
					break;
				}
				
			case 7:
			{
				System.out.println("Enter the department name");
				System.out.println("CS");
				System.out.println("IT");
				System.out.println("MECH");
				System.out.println("CIVIL");
				
				String d=sc.next();
				for(int i=0;i<alist.size();i++)
				{
					if(alist.get(i).getDept().equalsIgnoreCase(d))
					{
						System.out.println(alist.get(i).toString());
					}
				}
				
				System.out.println();
				break;
			}
			
			case 8:
				{
					System.out.println("1. For employee no wise");
					System.out.println("2. For employee name wise");
					System.out.println("3. For Salary wise");
					System.out.println("4. For designation wise");
					System.out.println("5. For department name wise");
					System.out.println("6. For default");
					int sortOn=sc.nextInt();
					
					switch(sortOn)
						{
							case 1:
								{
									System.out.println("1. For ascending order");
									System.out.println("2. For descending order");
									int order=sc.nextInt();
									
									if(order==1)
									{
										Collections.sort(alist,new Comparator<Employee>()
												{

													@Override
													public int compare(	Employee emp1,Employee emp2)
															 {
																return emp1.getEmpno()-emp2.getEmpno();
																
															 }
											
												});
										
										display(alist);
									}
									else if(order==2)
										{
											Collections.sort(alist,new Comparator<Employee>()
													{

														public int compare(Employee emp1,Employee emp2)
														{
															return emp2.getEmpno()-emp1.getEmpno();
														}
													
													});
											
											display(alist);
										}
									
									break;
								}
								
							case 2:
							{
								System.out.println("1. For ascending order");
								System.out.println("2. For descending order");
								int order=sc.nextInt();
								
								if(order==1)
								{
									Collections.sort(alist,new Comparator<Employee>()
											{

												@Override
												public int compare(	Employee emp1,Employee emp2)
														 {
															return emp1.getEname().compareTo(emp2.getEname());
															
														 }
										
											});
									display(alist);
								}
								else if(order==2)
									{
										Collections.sort(alist,new Comparator<Employee>()
												{

													public int compare(Employee emp1,Employee emp2)
													{
														return emp2.getEname().compareTo(emp1.getEname());
													}
												
												});
										
										display(alist);
									}
								break;
							}
							
							
							case 3:
							{
								System.out.println("1. For ascending order");
								System.out.println("2. For descending order");
								int order=sc.nextInt();
								
								if(order==1)
								{
									Collections.sort(alist,new Comparator<Employee>()
											{

												@Override
												public int compare(	Employee emp1,Employee emp2)
														 {
															return emp1.getSalary()-emp2.getSalary();
															
														 }
										
											});
									display(alist);
								}
								else if(order==2)
									{
										Collections.sort(alist,new Comparator<Employee>()
												{

													public int compare(Employee emp1,Employee emp2)
													{
														return emp2.getSalary()-emp1.getSalary();
													}
												
												});
										display(alist);
									}
								break;
							}
							
							case 4:
							{
								System.out.println("1. For ascending order");
								System.out.println("2. For descending order");
								int order=sc.nextInt();
								
								if(order==1)
								{
									Collections.sort(alist,new Comparator<Employee>()
											{

												@Override
												public int compare(	Employee emp1,Employee emp2)
														 {
															return emp1.getDesignation().compareTo(emp2.getDesignation());
															
														 }
										
											});
									display(alist);
								}
								else if(order==2)
									{
										Collections.sort(alist,new Comparator<Employee>()
												{

													public int compare(Employee emp1,Employee emp2)
													{
														return emp2.getDesignation().compareTo(emp1.getDesignation());
													}
												
												});
										display(alist);
									}
								break;
							}
							
							
							case 5:
							{
								System.out.println("1. For ascending order");
								System.out.println("2. For descending order");
								int order=sc.nextInt();
								
								if(order==1)
								{
									Collections.sort(alist,new Comparator<Employee>()
											{

												@Override
												public int compare(	Employee emp1,Employee emp2)
														 {
															return emp1.getDept().compareTo(emp2.getDept());
															
														 }
										
											});
									display(alist);
								}
								else if(order==2)
									{
										Collections.sort(alist,new Comparator<Employee>()
												{

													public int compare(Employee emp1,Employee emp2)
													{
														return emp2.getDept().compareTo(emp1.getDept());
													}
												
												});
										display(alist);
									}
								break;
							}
							
							case 6:
								{
									Collections.sort(alist);
									display(alist);
									break;
								}
						}
				}
			
			default :
			{
				System.out.println("Please enter correct value");
				break;		
			}
			}
			
		}while(input!=9);
		

	}

}