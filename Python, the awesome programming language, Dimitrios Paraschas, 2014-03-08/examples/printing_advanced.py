print "Let\'s have some fun with print!"

str1 = "I am a char sequence"
str2 = "Me too!"

print "%s. %s\n" % (str1,str2)#notice that this will print 2 line breaks

print "{}. {}{}".format(str1, str2, "\n")#this will also print 2 lb

print str1,". ", str2,"\n", #this will print one since that last comma
#tells print not to include line feed



