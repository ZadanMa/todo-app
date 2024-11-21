// Simulando datos para el dashboard
document.addEventListener("DOMContentLoaded", function() {
    // Datos de ejemplo para el dashboard
    const userCount = 120;
    const salesCount = 5000;
    const pendingCount = 25;

    // Insertar los datos en las tarjetas
    document.getElementById('userCount').textContent = userCount;
    document.getElementById('salesCount').textContent = `$${salesCount}`;
    document.getElementById('pendingCount').textContent = pendingCount;

    // Crear gráfico de actividad con Chart.js
    var ctx = document.getElementById('activityChart').getContext('2d');
    var activityChart = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul'], // Etiquetas para los meses
            datasets: [{
                label: 'Actividad',
                data: [20, 35, 60, 75, 90, 110, 150], // Datos de actividad por mes
                borderColor: 'rgba(75, 192, 192, 1)',
                fill: false
            }]
        },
        options: {
            responsive: true,
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        });
});
