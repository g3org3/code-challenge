import { Stack } from '@mui/material'

import Navbar from './Navbar'

interface Props {
  children: React.ReactNode
}

const Layout = ({ children }: Props) => {
  return (
    <Stack gap={4}>
      <Navbar />
      <Stack px={4}>{children}</Stack>
    </Stack>
  )
}

export default Layout
