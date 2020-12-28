commands = input()

courses = {}

while not commands == 'end':
    course, student = commands.split(' : ')

    if course not in courses:
        courses[course] = []
    courses[course].append(student)

    commands = input()
students_in_course = {}

sorted_courses = dict(sorted(courses.items(), key=lambda x: -len(x[1])))
for course, student in sorted_courses.items():
    print(f'{course}: {len(student)}')

    for student in sorted(student):
        print(f'-- {student}')
