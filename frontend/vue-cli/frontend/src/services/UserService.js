export async function getAllUsers() {
    const response = await fetch('/api/v1/users');
    return response.json
}

export async function createUser(data) {
    const response = await fetch(`/api/v1/users`, {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(data)
    })
    return response.json
}