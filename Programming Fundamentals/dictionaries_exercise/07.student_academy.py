rows = int(input())

students = {}
for row in range(rows):
    name = input()
    grade = float(input())

    if name not in students:
        students[name] = []
        students[name].append(grade)
    else:
        students[name].append(grade)

students_average_grades = {}

for student, grade in students.items():
    avr_grade = sum(grade) / len(grade)
    if avr_grade < 4.50:
        continue
    students_average_grades[student] = avr_grade

for student, avr_grade in sorted(students_average_grades.items(), key=lambda x: -x[1]):
    print(f'{student} -> {avr_grade:.2f}')
