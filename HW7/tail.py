import sys #import for argv
def LastLines(file, n): #function that prints the last n lines
    for line in (file.readlines() [-n:]):
         print(line, end ='')

         
if __name__ == '__main__':
    fname = open(sys.argv[1], "r") #opens file
    n = int(sys.argv[2]) #grabs number of lines to print
    LastLines(fname, n) #function call
    fname.close() #closes the file