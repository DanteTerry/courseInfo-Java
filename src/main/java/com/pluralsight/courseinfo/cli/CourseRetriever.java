package com.pluralsight.courseinfo.cli;

public class CourseRetriever {
    public static void main(String[] args){
        System.out.println("Retrieving course information...");

        if(args.length == 0 ){
            System.out.println("Please provide the course id");
            return;
        }

        try {
            retrieveCourse(args[0]);
        }catch (Exception e){
            System.out.println("An error occurred while retrieving course information: " + e.getMessage());
            e.printStackTrace();
        }

    }

    private static void retrieveCourse(String authorId) {
        System.out.println("Course information retrieved for author id: " + authorId);
    }
}
