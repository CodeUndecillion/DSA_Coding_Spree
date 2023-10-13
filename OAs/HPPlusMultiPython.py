def plusMulti(A):
    eve_num_eves = 0
    eve_num_odds = 0
    for i in range(2, len(A), 4):
        a = A[i] % 2
        b = A[i-2] % 2
        if (a == 1) and (b == 1):
            eve_num_odds += 1
        else:
            eve_num_eves += 1
    odd_num_eves = 0
    odd_num_odds = 0
    for i in range(3, len(A), 4):
        a = A[i] % 2
        b = A[i-2] % 2
        if (a == 1) and (b == 1):
            odd_num_odds += 1
        else:
            odd_num_eves += 1
    eve_ans = 0 
    if eve_num_odds % 2 != 0:
        eve_ans = 1
    odd_ans = 0
    if odd_num_odds % 2 != 1:
        odd_ans = 1
    
    if eve_ans > odd_ans:
        return "EVEN"
    elif eve_ans < odd_ans:
        return "ODD"
    return "NEUTRAL"
    
dd = [12,3,5,7,13,12]
print(plusMulti(dd))
        
    