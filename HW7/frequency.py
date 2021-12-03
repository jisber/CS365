import sys #for argv
from collections import Counter #for counter

if __name__ == '__main__':
    fname = open(sys.argv[1], "r") #reads in file name
    l = list()
    for line in fname: #stores all words in a list
        for word in line.split():
            l.append(word)

    x = Counter(l) 
    x= x.most_common() #creates a list of tuples
    t = sorted(x, key=lambda x: (x[1], x[0])) #sorts by name and value
    
    for i in t:
        print(i[0].ljust(20), str(i[1]).rjust(5)) #prints
    fname.close()