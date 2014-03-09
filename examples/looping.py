print "Looping using a range"
for i in range(0,4):
    print i

print

my_list=[0,1,2,3]

print "Looping using a list"
for i in my_list:
    print i

print "Looping using a dictonary"
my_dict={"a":1, "b":2,"c":3}
for key in my_dict:
    print "key: ", key,"item: ", my_dict[key]

print "\nDictonaries  aren't always sorted, so: "
for key in sorted(my_dict):
    print "key: ", key,"item: ", my_dict[key]

print

my_second_list=[3,4,5,6]

print "Let's iterate through 2 (or more) lists at once"
for i,j in zip(my_list, my_second_list):
    print i, " - ", j

print "\nUsing a while loop!"
i = 0;
while i<10 :
    i += 1
    print i

print

my_dict= {}

for i in range(0,11):
    my_dict[ chr( ord('a') + i )] = i
    # convert int to char, use it as a key

print "my_dict is:"
print my_dict, "\n"

my_dict_comprehension = {chr( ord('a') + i) :i for i in range(0,11)}

print "I did it with dict comprehension!"
print my_dict_comprehension, "\n"
