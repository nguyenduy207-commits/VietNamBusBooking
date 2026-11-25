// =====================================================
// Vietnam Bus Booking — Main JS
// =====================================================

document.addEventListener('DOMContentLoaded', () => {

    // 1. Highlight active nav link based on current path
    const currentPath = window.location.pathname;
    document.querySelectorAll('.nav-link').forEach(link => {
        const href = link.getAttribute('href');
        if (href && currentPath.startsWith(href) && href !== '/') {
            link.classList.add('active');
        }
    });

    // 2. Mobile menu toggle
    const mobileToggle = document.getElementById('mobileToggle');
    const mobileMenu = document.getElementById('mobileMenu');

    if (mobileToggle && mobileMenu) {
        mobileToggle.addEventListener('click', () => {
            mobileMenu.classList.toggle('open');
        });
    }

    // 3. Navbar shadow on scroll
    const navbar = document.getElementById('mainNavbar');
    if (navbar) {
        const onScroll = () => {
            if (window.scrollY > 10) {
                navbar.classList.add('scrolled');
            } else {
                navbar.classList.remove('scrolled');
            }
        };
        window.addEventListener('scroll', onScroll, { passive: true });
    }

    // 4. Re-render Lucide icons (safety net if icons added after initial load)
    if (window.lucide && typeof window.lucide.createIcons === 'function') {
        window.lucide.createIcons();
    }
});