import bisect

def main():
    current_cals = 0
    # max_cals = 0 #part one
    cals_list = []
    input_file = open('input.txt')
    lines = input_file.readlines()
    for line in lines:
        if line == '\n':
            bisect.insort(cals_list, current_cals)
            # if current_cals > max_cals: #part one
            #     max_cals = current_cals #part one
            current_cals = 0
        else:
            line.strip()
            current_cals += int(line)
    # print(max_cals) #part one
    print(cals_list[-1] + cals_list[-2] + cals_list[-3])


if __name__ == '__main__':
    main()