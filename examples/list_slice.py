my_list = range(0,11)

print "Our list is: "
print my_list

print "List slice from 4th to 7th non inclusive"
print my_list[3:6]#notice this starts counting from 0 also

print "From first to 8th(non inclusive) with step 2"
print my_list[0:8:2]

print "We can ommit numbers if they are list bounds"
print my_list[:8:2]

print "From  8th to first(non inclusive) with step -2"
print my_list[8:0:-2]

print "Now we are reversing a list the python way: "
print my_list[::-1]

