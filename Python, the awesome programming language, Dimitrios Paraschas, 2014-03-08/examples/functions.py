import random

def get_max(a, b):
    if a>b :
        return a
    elif b>a:
        return b
    else:
        return None

def get_average(a):
    return sum(a) / len(a)

print "Testig our function"
for i in range(0,5):
    print get_max(i, random.randrange(0,5))

print

my_range = range(0,11)
print "get average: "
print get_average(my_range)




