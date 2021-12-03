#Jacob Isber
#Homework 7 Q3
import sys
from golfer import Golfer, Course, Score
import datetime
from numpy import mean
from collections import Counter

def listToString(s): #Converts a list to a string
    str1 = ""
    for e in s:
        str1 = str1 + " " + e
    return str1

if __name__ == '__main__':
    #opens the files
    score_file = open(sys.argv[1], "r")
    course_file = open(sys.argv[2], "r")

    #Dictionaries
    Courses = dict()
    Golfers = dict()
    date = ''
    for line in score_file: #Goes through the file
        line.strip()
        line_split = line.split() #Splits the lines
        if line_split[3] in Golfers: #Sets the data if the golfer exists
            date = datetime.datetime(int(line_split[2]), int(line_split[0]), int(line_split[1]))
            name = " ".join(line_split[5:])
            player_score = Score(int(line_split[4]), name, date )
            Golfers[line_split[3]].score.append(player_score)
        else: #If the golfer doesn't exsist then create a new golfer and add them to the dictionary
            player = Golfer(line_split[3])
            date = datetime.datetime(int(line_split[2]), int(line_split[0]), int(line_split[1]))
            name = " ".join(line_split[5:])
            player_score = Score(int(line_split[4]), name, date)
            player.score.append(player_score)
            Golfers[line_split[3]] = player
    
    for line in course_file: #goes through the course file
        line.strip()
        line_split = line.split() #splits the line
        if len(line_split) > 0: #checks if the line is filled
            if line_split[0] == "Course": #checks if it is a course, if it is set the course name
                name = " ".join(line_split[1:])
                course = Course(name)
            elif line_split[0] == "Rating": #If it is a rating grab the information needed and sets the information of course
                course.setRating(float(line_split[1]))
                course.setSlope(float(line_split[3]))
                Courses[course.name] = course
    
    for i in Golfers.values():#computes the handicap of the golfers
        i.computeHandicap(Courses)

    new_Golfers = sorted(Golfers.values(), key=lambda x : x.handicap) #Sorts the golfers
     
    print('\n'.join(['{:5}'.format(str(g.handicap)) + " " + g.name for g in new_Golfers])) #prints in correct format
  
    #closes files
    score_file.close()
    course_file.close()