from collections import deque

def bfs(graph, visited, start):
    count = 0
    queue = deque([start])
    visited[start] = True
    
    while queue :
        index = queue.popleft()
        count += 1
        for a in graph[index]:
            
            if visited[a] != True:
                queue.append(a)
                visited[a] = True
            
    return count -1 
    
    
    


a = int(input())
b = int(input())

count = 0

graph = [[] for _ in range(a+1)]
visited = [False] * (a+1) 

for _ in range(b):
    m , n = map(int, input().split())
    graph[m].append(n)
    graph[n].append(m)
    
print(bfs(graph, visited, 1))