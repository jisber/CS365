from numpy import mean

#Score class that holds score, name of the course, and the date that the golfer played
class Score:
    def __init__(self, score, place, date):
        self.score = score
        self.date = date
        self.place = place

#Course class that has a name and rating and a slope
class Course:
     
    def __init__(self, name : str):
        self.name = name
    
    def setRating(self, rating : float):
        self.rating = rating
    
    def setSlope(self, slope: float):
        self.slope = slope

#Golfer class that takes in a golfer, has a list of 'scores' and a handicap
class Golfer:    
    def __init__(self, name):
        self.name = name
        self.score = []
        self.top20 = []
        self.differential = 0.0
        self.average = 0.0
    
    #sets and grabs the handicaps of the golfer
    def setHandicap(self, handicap):
        self.handicap = handicap
    
    def getHandicap(self):
        return self.handicap
    
    #computes the handicap
    def computeHandicap(self, courses : Course):
        if len(self.score) < 20: #if the player hasn't played 20 times 
            self.score.clear()
        else:
            self.score = sorted(self.score, key=lambda x: (x.date), reverse=True) #sort the courses and take the top 20
            self.score = self.score[0:20]
        
        #computes the differentials for the top 20 courses
        for i in self.score:
            t = courses[i.place]
            self.differential = (i.score - t.rating) * 113 / t.slope
            self.top20.append(self.differential) 

        #sorts and takes the top 10 scores
        self.top20 = sorted(self.top20, key=None, reverse=False)
        self.top20 = self.top20[:10]
        
        #computes the average
        average = mean(self.top20)
        self.handicap = .96 * average #sets the handicap
        
        self.handicap = round(self.handicap, 2) #rounds the handicap