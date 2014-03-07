my_list = range(0,11)

print "my_list is: "
print my_list
print

print "my_list item count :", len(my_list), "\n"

print "Deleting first item!"
del(my_list[0])

print "my_list is: "
print my_list, "\n"

#what id i want to use the item and then delete it?
#python gets you covered

first_item =  my_list.pop(0) #now first item is 1
print "this is the first item, which we just removed: %d" % first_item

print "my_list is: "
print my_list, "\n"

print "Lets add the item we just removed, at the end of the list!"
my_list.append(first_item)

print "my_list is: "
print my_list, "\n"

print "Let's put things in order"
my_list.sort()

print "my_list is: "
print my_list, "\n"

print "Think in reverse!"
my_list.reverse()

print "my_list is: "
print my_list, "\n"


