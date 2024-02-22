			package org.KH.app2;
			//반복문 : for, while, do~while
			public class Loop1 {
			
				public static void main(String[] args) {
			
			        int[] nums = {80,95,75,60,100,65,82,15,37,100};    // [] 배열 : 변수에 여러 값 넣기
			        String names[] = {"김","이","박","최","정","오","배","강","장","계"};
			        int tot = 0;
			        int maxpoint = 0;
			        int minpoint = nums[0];
			
			        // nums 배열 출력 : 점수 주르륵
			        System.out.print("nums : ");
				        for(int i = 0; i < nums.length; i++) {
				            System.out.print(nums[i]);
				            if(i != nums.length - 1) { // 마지막 요소가 아니라면 쉼표와 공백 출력
				                System.out.print(", ");
				            }
				        }
				    System.out.println();
			
			        // names 배열 출력 : 이름 주르륵
			        System.out.print("names : ");
				        for(int i = 0; i < names.length; i++) {
				            System.out.print(names[i]);
				            if(i != names.length - 1) { // 마지막 요소가 아니라면 쉼표와 공백 출력
				                System.out.print(", ");
				            }
				        }
				    System.out.println("\n");
			        
				    // 보기 예쁘게 한번 이름 / 점수 / 학점 / 합격여부를 써보자!
			        System.out.println("이름\t점수\t학점\t합격여부");
			
			        
			        // 학점 매기기
			        for(int i=0;i<10;i++) {
			            tot += nums[i];         //tot = tot + nums[i]
			            System.out.print(names[i]+"\t");
			            System.out.print(nums[i]+"\t");
			
			            // 총점에 따른 학점 매기기
			            if(nums[i]>=90) {
			                System.out.print("A\t");
			            } else if(nums[i]>=80) {
			                System.out.print("B\t");
			            } else if(nums[i]>=70) {
			                System.out.print("C\t");
			            } else if(nums[i]>=60) {
			                System.out.print("D\t");
			            } else {
			                System.out.print("F\t");
			            }
			            if(nums[i]>70) {
			            	System.out.print("합격\n");
			            } else {
			            	System.out.print("탈락\n");
			            }
		                
			            //최대점수, 최소점수 구하기
							if(nums[i]>maxpoint) maxpoint=nums[i];	
							if(nums[i]<minpoint) minpoint=nums[i];	
			        }
			
			        System.out.println("\n");
			        
			        System.out.println("전체 총점 : "+tot);
			        System.out.println("평균 : "+(tot/10.00f));	        
			        System.out.println("최대 점수 : "+maxpoint);
			        System.out.println("최소 점수 : "+minpoint);
					}
			
				
				}
				
