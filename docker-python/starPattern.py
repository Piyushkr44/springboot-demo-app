# Print star pattern using Nested Loop concept
for outer_loop in range(5):
    for inner_loop in range(0, outer_loop+1):
        print('*', end="")
    print()
