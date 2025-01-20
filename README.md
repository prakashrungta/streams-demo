ou# streamsDemo

**//Learn Basics from it**
https://www.youtube.com/watch?v=CwOfjXPL6-Q&t=29s

** // lambda **
https://www.youtube.com/watch?v=E10Q6-nWO9g

**//Learn (streams )Reduce from it** [ From 21 minutes onwards ]
https://www.youtube.com/watch?v=tklkyVa7KZo

**//Learn flatmap from here**
https://www.youtube.com/watch?v=CwvlS3ViGFQ

**//Parallel Streams from here**
https://chatgpt.com/c/678cc216-11b0-800a-9d89-17ba51d8ef1d



**//Interview Q**
https://medium.com/javarevisited/must-know-java-8-stream-interview-questions-for-java-developers-series-16-9d0579623a70

https://medium.com/@mehar.chand.cloud/java-stream-hard-interview-questions-54ea0de40acc

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

		

