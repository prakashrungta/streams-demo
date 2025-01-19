ou# streamsDemo

**//Learn Basics from it**
https://www.youtube.com/watch?v=CwOfjXPL6-Q&t=29s

**//Learn Reduce from it**
https://www.youtube.com/watch?v=tklkyVa7KZo

Concepts to remember are
two types
    filter : use it when you  need to filter soemthing 
    map     :use it when you need to do some operations in the stream
            : You will need to use predicate ( prefer lambda  returns boolean 
	    

//Taking a list , sorting it  , filtering for the even nos ,squaring it , and then reducing ( summing) it up
        int result = list.stream()
                .sorted()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, (c, e) -> c + e);
        System.out.println("sum of the list " + result);


//Taking a list and squaring (without filtering and then obtaining the sum 
        int resultsum = list.stream()
                .sorted()
                .map(n -> n * n)
                .reduce(0, (x, y) -> x + y);
        System.out.println("resultsum " + resultsum);

		

