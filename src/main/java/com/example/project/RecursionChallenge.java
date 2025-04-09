    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
               if(n == 1){
                return 2;
               } else{
                return bunnyEars(n-1) + 2;
               }
            }
        
            public static int factorial(int n){
                if(n == 1){
                    return 1;
                }
                return n * factorial(n-1);
            }

            public static int sumNumbers(int n){
                if(n == 1){
                    return 1;
                }
                return sumNumbers(n-1) + n; 
            }

            public static String countDown(int n){
                if(n == 0){
                    return "Blast Off!";
                }
                return "";
            }

            public static int power(int x, int n){
                if(n == 1){
                    return x;
                }
                int halfP = power(x, n / 2);
                if (n % 2 == 0) {
                    return halfP * halfP;
                } else {
                    return x * halfP * halfP;
                }
        
            }

            public static int fib(int n){
                if(n == 0){
                    return 0;
                } else if(n == 1 || n == 2){
                    return 1;
                }
                return fib(n-1) + fib(n-2);
            }

            public static int countX(String s){
                if (s.length() == 0){
                    return 0;
                }
                if(s.charAt(0) == 'x')
                return 1 + countX(s.substring(1));
                            
            return countX(s.substring(1));
            }

            public static String changePi(String s){
                if(s.length() <= 1){
                    return s;
                }
                if(s.substring(0, 2).equals("pi")){
                    return "3.14" + changePi(s.substring(2));
                }
                return s.charAt(0) + changePi(s.substring(1));
            }

            public static String reverse(String s){
                if(s.length() <= 1){
                    return s;
                }
                if(s.length() == 0){
                    return "";
                }
                return reverse(s.substring(1)) + s.substring(0,1);
            }

            public static Boolean isPalindrome(String s){
                if (s.length() <= 1) {
                    return true;
                }
                if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                    return isPalindrome(s.substring(1, s.length() - 1));
                } else {
                    return false;
                }
            }

    }