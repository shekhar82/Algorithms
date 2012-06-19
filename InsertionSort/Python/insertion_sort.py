def insertionSort(arrayList):
	length = len(arrayList)
	j = 1
	while (j < length):
		key = arrayList[j]
		i = j-1
		while(i >= 0 and arrayList[i] > key):
	 		arrayList[i+1] = arrayList[i]
			i = i -1
		arrayList[i+1] = key
		j = j+1
	return arrayList


list=[5,2,4,3,6,7,1]
myList = insertionSort(list)
print myList
