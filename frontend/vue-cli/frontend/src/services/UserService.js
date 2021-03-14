export async function getAllUsers() {
    const response = await fetch('/api/v1/users');
    return response.json
}