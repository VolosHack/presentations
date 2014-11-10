my_dict = {"a":3, "b":5 , "c":8 }

print "my_dict is: "
print my_dict, "\n"

print "my_dict item count: ", len(my_dict), "\n"

print "Get dict item by key"
print my_dict.get("a"), "\n"

print "Faster way"
print my_dict["a"], "\n"

print "We can get the keys"
my_keys = my_dict.keys()
print my_keys, "\n" #this is a list!

print "We can use those keys."
print my_dict[my_keys[0]], "\n"

print "Delete an item by key"
del my_dict["b"]

print "my_dict is: "
print my_dict, "\n"



