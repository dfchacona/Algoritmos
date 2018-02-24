
import matplotlib.pyplot as plt
import numpy as np
from time import time
a=0
b=1

list= []
print a
print b
for j in range(2, 100):
    n=j
    start_time = time()
    for i in range(2,n):

        ans=a+b
        a=b
        b=ans

    elapsed_time = time() - start_time
    list.append(elapsed_time)
returns =np.array(list)
plt.plot(returns)

