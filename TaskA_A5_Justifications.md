# TASK A5: DATA-STRUCTURE JUSTIFICATION

## 1. Queue (Task A1: Service Centre Waiting Line)
* Justification: A Queue operates on a First-In, First-Out (FIFO) basis. In a student service centre, fairness requires serving students strictly in their order of arrival. New students join at the back of the queue, while the student waiting at the front is served next.

## 2. Singly Linked List (Task A2 & Task D: Student Service Records)
* Justification: Student service records require a structure that grows dynamically as students arrive throughout the day. A Singly Linked List allows adding or removing student records easily by updating node pointers, without needing to pre-allocate a fixed size or shift existing records in memory.

## 3. Stack (Task A3: Postfix Expression Evaluation)
* Justification: A Stack operates on a Last-In, First-Out (LIFO) basis, which perfectly matches how postfix expressions are evaluated. Operands are pushed onto the stack, and when an operator is encountered, the most recently added operands are popped, evaluated, and the result is pushed back onto the stack.

## 4. Array (Task A4: Daily Statistics Tracking)
* Justification: Daily statistics track the service times of all students served during the simulated day. An Array is ideal here because the total count of served students is fixed at the end of the day, allowing simple indexing to traverse the records and compute total time, average waiting time, minimum, and maximum values.